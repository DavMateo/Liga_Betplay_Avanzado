/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.betplay;

import com.betplay.infoMgmt.adapter.in.console.TeamController;
import com.betplay.infoMgmt.application.usecase.CreateTeamUseCase;
import com.betplay.infoMgmt.domain.service.TeamService;
import com.betplay.infoMgmt.infrastructure.persistence.TeamRepository;

/**
 *
 * @author mateo
 */
public class Betplay {

    public static void main(String[] args) {
        TeamService teamService = new TeamRepository();
        CreateTeamUseCase createTeamUseCase = new CreateTeamUseCase(teamService);
        TeamController consoleAdapter = new TeamController(createTeamUseCase);

        consoleAdapter.start();
    }
}
