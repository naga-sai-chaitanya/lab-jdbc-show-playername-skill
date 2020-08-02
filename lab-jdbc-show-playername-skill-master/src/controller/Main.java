package controller;
import model.Player;
import java.io.BufferedReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Skill;

class Main{
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner in = new Scanner(System.in);
		SkillDAO skilldao= new SkillDAO();
		PlayerDAO playerdao = new PlayerDAO();
		List<Player>list=new ArrayList<Player>();
		
		list=playerdao.getAllPlayers();
		for (Player p : list) {
			System.out.println(p.getPlayerld()+" "+p.getName()+" "+p.getCountry()+" "+p.getSkill().getSkillName());
		}
	}
}