import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      model.put("heros", request.session().attribute("heros"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/output", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     ArrayList<SuperHero> heros = request.session().attribute("heros");
     if (heros == null) {
       heros = new ArrayList<SuperHero>();
       request.session().attribute("heros", heros);
     }

     String name = request.queryParams("name");
     Integer age = Integer.parseInt(request.queryParams("age"));
     String power = request.queryParams("power");
     String weakness = request.queryParams("weakness");
     SuperHero newHero = new SuperHero(name, age, power, weakness);
    //  request.session().attribute("heros", newHero);
     heros.add(newHero);
     model.put("template", "templates/created.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());
  }
}
