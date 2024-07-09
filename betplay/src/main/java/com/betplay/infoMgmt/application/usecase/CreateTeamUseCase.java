package com.betplay.infoMgmt.application.usecase;

import com.betplay.infoMgmt.domain.entity.Team;
import com.betplay.infoMgmt.domain.service.TeamService;

public class CreateTeamUseCase {
    private final TeamService teamService;

    public CreateTeamUseCase(TeamService teamService) {
        this.teamService = teamService;
    }

    public void execute(Team team) {
        teamService.createTeam(team);
    }
}
