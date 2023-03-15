package com.jjimenezz.jjztfcards.bootstrap;

import com.jjimenezz.jjztfcards.model.CollectorUser;
import com.jjimenezz.jjztfcards.model.Figure;
import com.jjimenezz.jjztfcards.model.FigureType;
import com.jjimenezz.jjztfcards.services.ICollectorsUserService;
import com.jjimenezz.jjztfcards.services.IFigureService;
import com.jjimenezz.jjztfcards.services.IFigureTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final ICollectorsUserService collectorsUserService;
    private final IFigureService figureService;
    private final IFigureTypeService figureTypeService;

    public DataLoader(ICollectorsUserService collectorsUserService, IFigureService figureService, IFigureTypeService pFgTypeService) {
        this.collectorsUserService = collectorsUserService;
        this.figureService = figureService;
        this.figureTypeService = pFgTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
//        FIGURES
        var fgVoyagerType = new FigureType();
        fgVoyagerType.setName("Voyager Class");
        var fgDeluxeType = new FigureType();
        fgDeluxeType.setName("Deluxe Class");
        this.figureTypeService.save(fgVoyagerType);
        this.figureTypeService.save(fgDeluxeType);
        System.out.println("Figure Types Loaded...");

        var fig1 = new Figure();
        fig1.setName("ST-13 Barricade");
        fig1.setReleaseYear(LocalDate.of(2018, 6, 1));
        fig1.setFigureType(fgDeluxeType);
        var fig2 = new Figure();
        fig2.setName("ST-88 Sideways");
        fig2.setReleaseYear(LocalDate.of(2022, 11, 1));
        fig2.setFigureType(fgDeluxeType);
        var fig3 = new Figure();
        fig3.setName("ST-48 Megatron TF2");
        fig3.setReleaseYear(LocalDate.of(2019, 6, 1));
        fig3.setFigureType(fgVoyagerType);

        this.figureService.save(fig1);
        this.figureService.save(fig2);
        this.figureService.save(fig3);
        System.out.println("Figures loaded...");

//        COLLECTOR USER
        var collector1 = new CollectorUser();
//        collector1.setId(1L);
        collector1.setName("Sophia");
        collector1.setFirstLastName("Rodriguez");
        collector1.setSecondLastName("Murillo");
        collector1.setBirthDate(LocalDate.of(1991, 5, 27));
        collector1.setPhone("+506-88556677");
        collector1.setCountry("Costa Rica");
        collector1.setState("Guanacaste");
        collector1.setAddress("Collector 1 super precise address information");
        fig1.setUserOwner(collector1);
        collector1.getFigures().add(fig1);

        this.collectorsUserService.save(collector1);

        var collector2 = new CollectorUser();
//        collector2.setId(1L);
        collector2.setName("Gabriela");
        collector2.setFirstLastName("Campos");
        collector2.setSecondLastName("Vargas");
        collector2.setBirthDate(LocalDate.of(1998, 9, 17));
        collector2.setPhone("+506-76289746");
        collector2.setCountry("Costa Rica");
        collector2.setState("Alajuela");
        collector2.setAddress("Collector 2 super precise address information");
        fig2.setUserOwner(collector2);
        fig3.setUserOwner(collector2);
        collector2.getFigures().addAll(Set.of(fig2, fig3));

        this.collectorsUserService.save(collector2);

        System.out.println("Collectors loaded...");
    }

}
