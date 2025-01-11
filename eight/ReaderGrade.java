package eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderGrade {
    private List<Grade> gradeList;

    public List<Grade> getData1() {
        return gradeList;
    }

    public ReaderGrade(String filePath) {
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

        this.gradeList = mapGrade(data);
    }




    private List<Grade> mapGrade(List<String> lines){
        List<Grade> persons = new ArrayList<>();
        for(int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(";");
            int a = Integer.parseInt(line[0].trim());
            int b = Integer.parseInt(line[1].trim());
            persons.add(new Grade(a, b));
        }
        return persons;
    }
}