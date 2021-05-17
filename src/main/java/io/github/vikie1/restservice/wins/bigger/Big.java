package io.github.vikie1.restservice.wins.bigger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Big {
    @Id
    private String win;

    public Big(String win) {
        super();
        this.win = win;
    }
    public Big() {}

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
