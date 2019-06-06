package web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.IProduitDao;
import dao.ProduitDao;
import metier.entities.Produit;

@WebServlet(name="cs", urlPatterns= {"*.do"})
public class ControleurServlet extends HttpServlet {
	private IProduitDao metier;
	
	@Override
	public void init() throws ServletException {
		metier = new ProduitDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if (path.equals("/index.do")) {
			req.getRequestDispatcher("produits.jsp").forward(req, resp);
		}
		else if (path.equals("/chercher.do")) {
			String motCle = req.getParameter("motCle");
			ProduitModel model = new ProduitModel();
			List<Produit> produits=metier.produitsParMC("%"+ motCle +"%");
			model.setProduits(produits);
			req.setAttribute("model", model);
			req.getRequestDispatcher("produits.jsp").forward(req, resp);
			
		}
		else if (path.equals("/saisie.do")) {
			req.getRequestDispatcher("saisieProduit.jsp").forward(req, resp);
		}
		else if ((path.equals("/saveProduit.do")) && (req.getMethod().equals("POST"))) {
			String des = req.getParameter("designation");
			double prix = Double.parseDouble(req.getParameter("prix"));
			int quantite = Integer.parseInt(req.getParameter("quantite"));
			Produit p = metier.save(new Produit(des,prix,quantite));
			req.setAttribute("produit", p);
			req.getRequestDispatcher("confirmation.jsp").forward(req, resp);
		}
		else {
			resp.sendError(Response.SC_NOT_FOUND);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
