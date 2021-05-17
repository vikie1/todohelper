package io.github.vikie1.restservice.wins.small;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Small {
    
    @Id
    private String win;

    public Small(String win) {
        super();
        this.win = win;
    }
    public Small(){}

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
