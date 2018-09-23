package System;

/**
 * Java gargabe collection utility
 */
public final class GC
{
    /**
     * Releases memory
     */
    public static void ReleaseMemory ()
    {
        Runtime.getRuntime().freeMemory();
    }

    /**
     * Calls java gargabe collection
     */
    public static void Call()
    {
        Runtime.getRuntime().gc();
    }

    /**
     * Returns the max memory available
     * @return
     */
    public long MaxMemory()
    {
        return Runtime.getRuntime().maxMemory();
    }

    /**
     * Return how many processors are available
     * @return
     */
    public static long AvailableProcessors()
    {
        return Runtime.getRuntime().availableProcessors();
    }

    /**
     * Ends the executing exeting with a status
     * @param status
     */
    public static void Exit(int status)
    {
        Runtime.getRuntime().exit( status > 0 ? status : 0 );
    }

    /**
     * Runs finalization
     */
    public static void RunFinalization()
    {
        Runtime.getRuntime().runFinalization();
    }

    /**
     * Total Memory
     */
    public static long TotalMemory()
    {
        return Runtime.getRuntime().totalMemory();
    }

    /**
     * Kills a given thread
     * @param t
     */
    public static void KillThread(Thread t)
    {
        Runtime.getRuntime().addShutdownHook(t);
    }

    /**
     * Loads a file to jvm
     * @param file
     */
    public static void LoadFile(String file)
    {
        Runtime.getRuntime().load(file);
    }

    /**
     * Returns Runttime reference
     * @return
     */
    public static Runtime GetRunetime()
    {
        return Runtime.getRuntime();
    }
}
