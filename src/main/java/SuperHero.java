import java.util.ArrayList;

public class SuperHero {
  private String mName;
  private Integer mAge;
  private String mPower;
  private String mWeakness;
  private static ArrayList<SuperHero> heroesList = new ArrayList<SuperHero>();

  public SuperHero(String name, Integer age, String power, String weakness){
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    heroesList.add(this);
  }

  public String getName(){
    return mName;
  }

  public Integer getAge(){
    return mAge;
  }

  public String getPower(){
    return mPower;
  }

  public String getWeakness(){
    return mWeakness;
  }

  public static ArrayList<SuperHero> returnList() {
    return heroesList;
  }

}
