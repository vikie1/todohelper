package io.github.vikie1.restservice.wins.medium;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medium {
    
    @Id
    private String win;

    public Medium(String win) {
        super();
        this.win = win;
    }
    public Medium() {}

    /**
     * @return the win
     */
    public String getWin() {
        return win;
    }

    /**
     * @param win the win to set
     */
    public void setWin(String win) {
        this.win = win;
    }
}
