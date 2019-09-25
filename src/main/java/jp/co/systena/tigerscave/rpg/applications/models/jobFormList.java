package jp.co.systena.tigerscave.rpg.applications.models;

import java.util.ArrayList;
import java.util.List;

public class jobFormList {

  private static final int jobCount = 4;

  public List<JobForm> getJobFormList() {
    List<JobForm> jobFormList = new ArrayList<JobForm>();

    for (int count = 0; count < jobCount; count++) {
      JobForm jobForm = new JobForm();
      jobFormList.add(jobForm);
    }

    return jobFormList;
  }
}
