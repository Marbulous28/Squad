import java.util.ArrayList;

public class Squad {
  private SuperHero mMember;
  private String mSquadName;
  private String mCause;
  private static ArrayList<Squad> squadList = new ArrayList<Squad>();
  private static ArrayList<SuperHero> memberList = new ArrayList<SuperHero>();

  public createSquad(String squadName, String cause, SuperHero member) {
    mSquadName = squadName;
    mCause = cause;
    mMember = member;
    squadList.add(this);
  }
