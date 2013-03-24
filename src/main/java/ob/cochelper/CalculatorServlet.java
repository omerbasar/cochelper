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

      req.setAttribute("cannons", cannons);
      req.setAttribute("archerTowers", archerTowers);
      req.setAttribute("mortars", mortars);
      req.setAttribute("wizardTowers", wizardTowers);
      req.setAttribute("airDefenses", airDefenses);
      req.setAttribute("hiddenTeslas", hiddenTeslas);
      req.setAttribute("xBows", xBows);

      resp.addCookie(new Cookie(COOKIE_PREFIX + "cannons", cannons.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "archerTowers", archerTowers.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "mortars", mortars.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "wizardTowers", wizardTowers.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "airDefenses", airDefenses.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "hiddenTeslas", hiddenTeslas.replaceAll(",", "_")));
      resp.addCookie(new Cookie(COOKIE_PREFIX + "xBows", xBows.replaceAll(",","_")));

      Village village = new Village(9, cannons, archerTowers, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows);
      village.calculate();
      req.setAttribute("elapsedBuildTime", village.makeTimeReadable(village.getElapsedBuildTime()));
      req.setAttribute("elapsedGold", village.makeResourceReadable(village.getElapsedResource(Resource.GOLD)));
      req.setAttribute("elapsedElixir", village.makeResourceReadable(village.getElapsedResource(Resource.ELIXIR)));
      req.setAttribute("elapsedDarkElixir", village.makeResourceReadable(village.getElapsedResource(Resource.DARK_ELIXIR)));

      req.setAttribute("remainingBuildTime", village.makeTimeReadable(village.getRemainingBuildTime()));
      req.setAttribute("goldRequired", village.makeResourceReadable(village.getRemainingResource(Resource.GOLD)));
      req.setAttribute("elixirRequired", village.makeResourceReadable(village.getRemainingResource(Resource.ELIXIR)));
      req.setAttribute("darkElixirRequired", village.makeResourceReadable(village.getRemainingResource(Resource.DARK_ELIXIR)));

      req.setAttribute("village", village);

      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
      dispatcher.forward(req, resp);
   }
}
