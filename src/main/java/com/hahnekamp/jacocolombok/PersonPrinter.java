package com.hahnekamp.jacocolombok;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class PersonPrinter {
  private Person person;
  private String separator = " ";
  private String noLastnameLog = "That person has no name";

  public PersonPrinter(Person person) {
    this.person = person;
  }
  public String toString() {
    if ("".equals(person.getLastname())) {
      log.info(noLastnameLog);
      return "";
    }

    return String.format(person.getFirstname() + this.separator + person.getLastname());
  }
}
