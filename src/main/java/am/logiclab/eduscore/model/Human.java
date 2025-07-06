package am.logiclab.eduscore.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String fullName;

    public void setFullName(String fullName) {
        // Regex՝ Սկսվում է մեծատառով, հետո փոքրատառեր, բացատ, հետո էլի մեծատառով և փոքրատառերով
        String regex = "^[Ա-ՖԱ-ֆA-Z][ա-ֆa-z]+\\s[Ա-ՖԱ-ֆA-Z][ա-ֆa-z]+$";

        if (fullName != null && fullName.matches(regex)) {
            this.fullName = fullName;
        } else {
            throw new IllegalArgumentException("Անունը պետք է լինի իրական ձևաչափով՝ 'Անուն Ազգանուն'");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }



}
