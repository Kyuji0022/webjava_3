package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;

public class CharacterList extends CharacterBase {

  @Override
  public List<String> getJobList() {
    return this.jobNameList;
  }

  @Override
  public List<String> getNameList() {
    return this.charaNameList;
  }

  @Override
  public List<String> getAttackWayList() {
    return this.attackWayList;
  }

}
