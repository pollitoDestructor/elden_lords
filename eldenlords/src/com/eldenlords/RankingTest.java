package com.eldenlords;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RankingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
    public void testRanking()
    {
        Ranking miRanking = Ranking.getRanking();
     
        miRanking.imprimirRanking();

        InfoJugador J1 = new InfoJugador(10, "Jaimito");
        InfoJugador J2 = new InfoJugador(22, "Hercules");
        InfoJugador J3 = new InfoJugador(6, "Casimiro");
        miRanking.añadirRanking(J1);
        miRanking.añadirRanking(J2);
        miRanking.añadirRanking(J3);
        miRanking.imprimirRanking();
        miRanking.ordenarRanking();
        miRanking.imprimirRanking();
        
        
        miRanking.reiniciarRanking();
        miRanking.imprimirRanking();
    }

}
