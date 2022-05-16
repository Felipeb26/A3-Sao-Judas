package com.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.config.ConexaoDb;

public class Tese {

	public static void main(String[] args) {
		try {
			Connection conn = ConexaoDb.conecta();
			PreparedStatement pst;
			ResultSet rs;

			String sql = "select * from usuarios";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.next()){
				System.out.println(rs);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}