package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.List;

public class JobForm {
    private List<String> jobNameList;
    private List<String> charaNameList;

    //デフォルトの職業名と名前
    public List<String> getJobNameList() {
        return jobNameList;
    }

    public List<String> getCharaNameList() {
      return charaNameList;
    }

    public void setCharaNameList(List<String> charaName) {
      this.charaNameList.addAll(charaName);
    }

    public void setJobNameList(List<String> jobName) {
      this.jobNameList.addAll(jobName);
    }
}