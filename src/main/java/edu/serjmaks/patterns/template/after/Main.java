package edu.serjmaks.patterns.template.after;

import edu.serjmaks.patterns.template.after.controller.reader.AbstractReader;
import edu.serjmaks.patterns.template.after.controller.reader.OrganizationReader;
import edu.serjmaks.patterns.template.after.controller.reader.PersonReader;
import edu.serjmaks.patterns.template.after.model.Organization;
import edu.serjmaks.patterns.template.after.model.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractReader<Person> personReader = new PersonReader(new File("src/main/java/edu/patterns/template/person.csv"));
        List<Person> people = personReader.readAll();
        System.out.println(people);

        AbstractReader<Organization> organizationReader = new OrganizationReader(new File("src/main/java/edu/patterns/template/organization.csv"));
        List<Organization> organization = organizationReader.readAll();
        System.out.println(organization);

    }
}
