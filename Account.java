/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import javax.persistence.*;

@Entity
public class Account {
    @Id
    private int accountId;
    private String holderName;
    private double balance;

    // Getters, setters, constructors
}
