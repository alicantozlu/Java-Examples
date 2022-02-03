public abstract class GameObject {
    private int x;

    public void thing(){
        System.out.println("Abstract degilim.");
    }
    //this method must be implemented by any class that extends GameObject
    public abstract void draw();

    public static void main(String[] args) {

        GameObject player = new Player();
        Player player1 = new Player();
        //player.someMethod();
        player1.someMethod();
        //player.draw();

        Player p1 = new Player();
        p1.thing();

        Menu menu = new Menu();
        //menu.draw();

        GameObject [] gameObjects = new GameObject[2];
        gameObjects[0] = player;
        gameObjects[1] = menu;

        for(GameObject obj : gameObjects){
            obj.draw();
        }
        //GameObject myObject = new GameObject();
        // bastract classes exits to be extended, they can not be instantiated
    }
}
