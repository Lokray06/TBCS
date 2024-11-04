package system;

import graphics.MyFrame;

public class Engine
{
    public static boolean running;
    public static boolean firstTime = true;
    
    static void Init()
    {
        System.out.println("Start");
        Start();
        MainLoop();
    }
    
    static private void Start()
    {
        running = true;
    }
    
    static private void MainLoop()
    {
        while(running)
        {
            GetInputs();
            Update();
            Render();
        }
    }
    
    static private boolean[] GetInputs()
    {
        //TODO Handle inputs
        boolean arrayOfInputs[] = new boolean[255];
        System.out.println("Get inputs");
        return arrayOfInputs;
    }
    
    private static void Update()
    {
        System.out.println("Update");
        //Clockar botones
        
    }
    
    private static void Render()
    {
    }
}