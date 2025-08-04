package com.yourcompany.clientmanagement.controller;

import com.yourcompany.clientmanagement.dao.VersmentDAO;
import com.yourcompany.clientmanagement.model.Versment;

import java.math.BigDecimal;
import java.util.List;

public class VersmentController {
    private VersmentDAO versmentDAO;

    public VersmentController() {
        versmentDAO = new VersmentDAO();
    }

    // 🔄 1. Fetch all versments
    public List<Versment> fetchAllVersments() {
        return versmentDAO.getAllVersments();
    }

    // 🔄 2. Fetch versments by client ID
    public List<Versment> fetchVersmentsByClientId(int clientId) {
        return versmentDAO.getVersmentsByClientId(clientId);
    }

    // ➕ 3. Add a versment
    public int addVersment(Versment versment) {
        return versmentDAO.insertVersment(versment);
    }

    // ✏️ 4. Update a versment
    public boolean updateVersment(Versment versment) {
        return versmentDAO.updateVersment(versment);
    }

    // ❌ 5. Delete a versment by ID
    public boolean deleteVersment(int versmentId) {
        return versmentDAO.deleteVersmentById(versmentId);
    }

    // 🔎 6. Get versment by ID
    public Versment getVersmentById(int id) {
        return versmentDAO.getVersmentById(id);
    }

    // 💰 7. Get total versments amount by client ID
    public BigDecimal getTotalVersmentsByClientId(int clientId) {
        return versmentDAO.getTotalVersmentsByClientId(clientId);
    }
}