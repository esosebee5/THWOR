/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housewithoneroom;

import characters.Player;
import java.util.LinkedList;
import rooms.House;
import rooms.IRoom;
import titles.GameStrings;

/**
 *
 * @author esose
 */
public class Game {
    
    public GameStrings gameStrings;
    public Player player;
    public IRoom currentRoom;
    public House house = new House();
    public LinkedList<IRoom> visitedRooms = new LinkedList<>();
    public int numberOfVisitedRooms = 0;
    public boolean state = true;
    
    public Game() {
        this.gameStrings = new GameStrings();
        this.house = new House();
        this.currentRoom = this.house.getCorridor().getFirst();
    }
    
    public Game(int roomId) {
        this.gameStrings = new GameStrings();
        this.house = new House();
        this.currentRoom = this.house.getCorridor().get(roomId);
    }
    
    public String exitGame() {
        this.state = false;
        return gameStrings.getEOGUser();
    }
    
    //public save(){}
}
