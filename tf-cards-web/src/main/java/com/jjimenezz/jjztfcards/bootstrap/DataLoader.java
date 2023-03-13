package com.jjimenezz.jjztfcards.bootstrap;

import com.jjimenezz.jjztfcards.model.CollectorUser;
import com.jjimenezz.jjztfcards.model.Figure;
import com.jjimenezz.jjztfcards.services.ICollectorsUserService;
import com.jjimenezz.jjztfcards.services.IFigureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final ICollectorsUserService collectorsUserService;
    private final IFigureService figureService;

    public DataLoader(ICollectorsUserService collectorsUserService, IFigureService figureService) {
        this.collectorsUserService = collectorsUserService;
        this.figureService = figureService;
    }

    @Override
    public void run(String... args) throws Exception {
        var fig1 = new Figure();
        fig1.setName("ST-13 Barricade");
        fig1.setReleaseYear(LocalDate.of(2018, 6, 1));
        var fig2 = new Figure();
        fig2.setName("ST-88 Sideways");
        fig2.setReleaseYear(LocalDate.of(2022, 11, 1));
        fig2.setId(2L);

        this.figureService.save(fig1);
        this.figureService.save(fig2);
        System.out.println("Figures loaded...");

        var collector1 = new CollectorUser();
//        collector1.setId(1L);
        collector1.setName("Sophia");
        collector1.setFirstLastName("Rodriguez");
        collector1.setSecondLastName("Murillo");
        collector1.setBirthDate(LocalDate.of(1991, 5, 27));

        this.collectorsUserService.save(collector1);

        var collector2 = new CollectorUser();
//        collector2.setId(1L);
        collector2.setName("Gabriela");
        collector2.setFirstLastName("Campos");
        collector2.setSecondLastName("Vargas");
        collector2.setBirthDate(LocalDate.of(1998, 9, 17));

        this.collectorsUserService.save(collector2);
        System.out.println("Collectors loaded...");
    }

}
