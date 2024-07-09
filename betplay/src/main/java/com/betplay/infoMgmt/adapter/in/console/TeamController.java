package com.betplay.infoMgmt.adapter.in.console;

import java.util.Scanner;

import com.betplay.infoMgmt.application.usecase.CreateTeamUseCase;
import com.betplay.infoMgmt.domain.entity.Team;

public class TeamController {
    private CreateTeamUseCase createTeamUseCase;

    public TeamController(CreateTeamUseCase createTeamUseCase) {
        this.createTeamUseCase = createTeamUseCase;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter team name: ");
            String name = scanner.nextLine();

            System.out.println("Enter city name: ");
            String city = scanner.nextLine();

            System.out.println("Enter stadium name: ");
            String stadium = scanner.nextLine();

            System.out.println("Enter coach name: ");
            String coach = scanner.nextLine();

            Team team = new Team();
            team.setName(name);
            team.setCity(city);
            team.setStadium(stadium);
            team.setCoach(coach);

            createTeamUseCase.execute(team);
        }

        System.out.println("Team created successfully!");
    }
}
