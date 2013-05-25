/**
 * Copyright 2012 Google Inc. All Rights Reserved. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ob.cochelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CalculatorServlet extends HttpServlet {

   String COOKIE_PREFIX = "coc_";

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      if(req.getCookies() != null){
         for (Cookie cookie : req.getCookies()) {
            String name = cookie.getName();
            if(name.startsWith(COOKIE_PREFIX)){
               req.setAttribute(name.substring(COOKIE_PREFIX.length()), cookie.getValue().replaceAll("_", ","));
            }
         }
      }

      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
      dispatcher.forward(req, resp);
   }

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse resp)
           throws IOException, ServletException {
      String cannons = req.getParameter("cannons");
      String archerTowers = req.getParameter("archerTowers");
      String mortars = req.getParameter("mortars");
      String wizardTowers = req.getParameter("wizardTowers");
      String airDefenses = req.getParameter("airDefenses");
      String hiddenTeslas = req.getParameter("hiddenTeslas");
      String xBows = req.getParameter("xBows");
      String infernoTowers = req.getParameter("infernoTowers");
      String elixirCollectors = req.getParameter("elixirCollectors");
      String goldMines = req.getParameter("goldMines");
      String darkElixirDrills = req.getParameter("darkElixirDrills");
      String goldStorages = req.getParameter("goldStorages");
      String elixirStorages = req.getParameter("elixirStorages");
      String darkElixirStorages = req.getParameter("darkElixirStorages");
      Integer builderCount = Integer.parseInt(req.getParameter("builderCount"));
      String armyCamps = req.getParameter("armyCamps");
      String barracks = req.getParameter("barracks");
      String darkBarracks = req.getParameter("darkBarracks");
      Integer laboratory = Integer.parseInt(req.getParameter("laboratory"));
      Integer spellFactory = Integer.parseInt(req.getParameter("spellFactory"));
      Integer townHall = Integer.parseInt(req.getParameter("townHall"));
      Integer clanCastle = Integer.parseInt(req.getParameter("clanCastle"));
      Integer barbarKing = Integer.parseInt(req.getParameter("barbarKing"));
      Integer archerQueen = Integer.parseInt(req.getParameter("archerQueen"));

      // todo: arayüzden buildingCategorySet'ini al
      Set<BuildingCategory> categories = new HashSet<BuildingCategory>();
      categories.add(BuildingCategory.DEFENSE);

      // todo: arayuzden duvarlari al
      Map<Integer, Integer> wallMap = new HashMap<Integer, Integer>();

      req.setAttribute("cannons", cannons);
      req.setAttribute("archerTowers", archerTowers);
      req.setAttribute("mortars", mortars);
      req.setAttribute("wizardTowers", wizardTowers);
      req.setAttribute("airDefenses", airDefenses);
      req.setAttribute("hiddenTeslas", hiddenTeslas);
      req.setAttribute("xBows", xBows);
      req.setAttribute("infernoTowers", infernoTowers);
      req.setAttribute("elixirCollectors", elixirCollectors);
      req.setAttribute("goldMines", goldMines);
      req.setAttribute("darkElixirDrills", darkElixirDrills);
      req.setAttribute("goldStorages", goldStorages);
      req.setAttribute("elixirStorages", elixirStorages);
      req.setAttribute("darkElixirStorages", darkElixirStorages);
      req.setAttribute("builderCount", builderCount);
      req.setAttribute("armyCamps", armyCamps);
      req.setAttribute("barracks", barracks);
      req.setAttribute("darkBarracks", darkBarracks);
      req.setAttribute("laboratory", laboratory);
      req.setAttribute("spellFactory", spellFactory);
      req.setAttribute("townHall", townHall);
      req.setAttribute("clanCastle", clanCastle);
      req.setAttribute("barbarKing", barbarKing);
      req.setAttribute("archerQueen", archerQueen);

      resp.addCookie(new Cookie(COOKIE_PREFIX + "cannons", cannons.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "archerTowers", archerTowers.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "mortars", mortars.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "wizardTowers", wizardTowers.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "airDefenses", airDefenses.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "hiddenTeslas", hiddenTeslas.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "xBows", xBows.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "infernoTowers", infernoTowers.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "elixirCollectors", elixirCollectors.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "goldMines", goldMines.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "darkElixirDrills", darkElixirDrills.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "goldStorages", goldStorages.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "elixirStorages", elixirStorages.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "darkElixirStorages", darkElixirStorages.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "builderCount", builderCount + ""));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "armyCamps", armyCamps.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "barracks", barracks.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "darkBarracks", darkBarracks.replaceAll(",","_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "laboratory", laboratory + ""));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "spellFactory", spellFactory + ""));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "townHall", townHall + ""));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "clanCastle", clanCastle + ""));

      resp.addCookie(new Cookie(COOKIE_PREFIX + "barbarKing", barbarKing + ""));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "archerQueen", archerQueen + ""));

      Village village = new Village(townHall, cannons, archerTowers, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages,
              builderCount, armyCamps, barracks, darkBarracks,
              laboratory, spellFactory, clanCastle,
              barbarKing, archerQueen, categories, wallMap);
      village.calculate();

      req.setAttribute("village", village);

      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
      dispatcher.forward(req, resp);
   }
}
