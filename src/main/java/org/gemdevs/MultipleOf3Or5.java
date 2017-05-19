package org.gemdevs;

import java.util.ArrayList;
import java.util.List;

public class MultipleOf3Or5 {

  private Integer limit;

  private MultipleOf3Or5(){}

  public Integer sumMultiplesOf3Or5Under() {
    checkLimit();
    return sumMultiples();
  }

  private void checkLimit() {
    if (limit == null)
      throw new IllegalArgumentException("Limit parameter should not be null");
  }

  private Integer sumMultiples() {
    Integer sum = 0;
    for (Integer multiple : getMultiplesOf3Or5Under(limit)) {
      sum += multiple;
    }
    return sum;
  }

  private List<Integer> getMultiplesOf3Or5Under(Integer limit) {
    List<Integer> multiples = new ArrayList();
    for (int i = 0; i < limit; i++) {
      if (isMultipleOf3Or5(i)) {
        multiples.add(i);
      }
    }
    return multiples;
  }

  private boolean isMultipleOf3Or5(int i) {
    return i % 3 == 0 || i % 5 == 0;
  }

  public void setLimit(Integer limit){
    this.limit = limit;
  }

  public static MultipleOf3Or5 createMultipleOf3Or5() {
    return new MultipleOf3Or5();
  }
}
