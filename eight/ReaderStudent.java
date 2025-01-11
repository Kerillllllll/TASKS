package eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderStudent {
    private List<Student> personList;


    public List<Student> getData() {
        return personList;
    }


    public ReaderStudent(String filePath) {
        List<String> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.personList = mapPerson(data);
    }



    private List<Student> mapPerson(List<String> lines){
        List<Student> persons = new ArrayList<>();
        for(int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(";");
            int a = Integer.parseInt(line[0].trim());
            persons.add(new Student(a, line[1], line[2]));
        }
        return persons;
    }


    }
