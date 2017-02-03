package exercices.lifeschool;

/**
 * Created by jerome on 20/01/17.
 */

import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public float getAverage() {
        int ageTotal = 0;
        for (Student student : students) {
            ageTotal += student.getAge();
        }
        return ageTotal / students.size();
    }
Str
    // Une méthode toString pour afficher
    @Override
    public String toString() {
        String reponse = "";
        reponse = reponse + "Dans l'école : " + name + ", les étudiants sont :\n" ;
        for (Student stud : this.students){
            reponse = reponse + stud + '\n';
        }
        return reponse;

    }

    /* méthode générée
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }*/

}



