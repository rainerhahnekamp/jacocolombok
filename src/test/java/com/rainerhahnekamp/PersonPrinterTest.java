package com.rainerhahnekamp;

import static org.junit.Assert.assertEquals;

import com.hahnekamp.jacocolombok.PersonPrinter;
import com.hahnekamp.jacocolombok.Person;
import org.junit.Test;

public class PersonPrinterTest {
  @Test
  public void testDefault() {
    Person harrison = Person.builder().firstname("John").lastname("Harrison").build();

    assertEquals("John Harrison", new PersonPrinter(harrison).toString());
  }

  @Test
  public void testNoLastname() {
    Person anonymous = Person.builder().firstname("anonymous").lastname("").build();

    assertEquals("", new PersonPrinter(anonymous).toString());
  }
}
