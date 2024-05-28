package org.application.IA.IA_Palkia.Facts;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Id("playerPalkia")
public class Player {
    @Param(0)
    public int x;
    @Param(1)
    public int y;

    public Player() {}
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
