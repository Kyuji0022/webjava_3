package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;

public abstract class CommandBase {
  protected List<String> attackLog;
  protected List<String> healLog;

  public void switchCommand(CommandForm commandForm, CharacterList Character) {

    switch (commandForm.getNextAction()) {
      case "たたかう":
        setCommandLog(Character);
        break;
      case "かいふく":
        setRecoveryLog(Character);
    }

  }
  public void setCommandLog(CharacterList Character) {
    for (int count = 0; count < Character.charaNameList.size(); count++) {
        this.attackLog.add(Character.charaNameList.get(count) + "は" + Character.attackWayList.get(count) + "で攻撃した");
    }

  }

  public List<String> getCommandLog() {
    return this.attackLog;
  }

  public void setRecoveryLog(CharacterList Character) {
    for (int count = 0; count < Character.charaNameList.size(); count++) {
        this.healLog.add(Character.charaNameList + "は" + Character.RecoveryWayList.get(count) + "でかいふくした");
    }

  }

  public List<String> getRecoveryLog() {
    return this.healLog;
  }
}
