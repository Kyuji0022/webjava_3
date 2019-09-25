package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class CharacterBase {
  protected List<String> jobNameList;
  protected List<String> charaNameList;
  protected List<String> attackWayList;
  protected List<String> RecoveryWayList;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public void setJobNameList(List<String> jobList){
    for (String job : jobList) {
      this.jobNameList.add(job);
      List<String> way;
      switch (job) {
        case "戦士":
          way = jdbcTemplate.query("SELECT * FROM characters WHERE characters_name='戦士'", new BeanPropertyRowMapper<String>());
          this.attackWayList.addAll(way);
          break;
        case "魔法使い":
          way = jdbcTemplate.query("SELECT * FROM characters WHERE characters_name='魔法使い'", new BeanPropertyRowMapper<String>());
          this.attackWayList.addAll(way);
          break;
        case "武闘家":
          way = jdbcTemplate.query("SELECT * FROM characters WHERE characters_name='武闘家'", new BeanPropertyRowMapper<String>());
          this.attackWayList.addAll(way);
          break;
        default:
          this.attackWayList.add("じたばた");
      }

      switch (job) {
        case "魔法使い":
          this.RecoveryWayList.add("まほう");
          break;
        default:
          this.RecoveryWayList.add("やくそう");
      }
    }
  }

  public abstract List<String> getJobList();

  public void setCharaNameList(List<String> nameList){
    this.charaNameList = nameList;
  }

  public abstract List<String> getNameList();
  public abstract List<String> getAttackWayList();
}
