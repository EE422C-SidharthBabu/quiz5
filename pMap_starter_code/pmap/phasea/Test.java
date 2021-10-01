/*
 * Phase A <sg52879><snb2593>
 * Phase B <snb2593><sg52879>
 */
package pmap.phasea;

public class Test
{
    public static void main(String[] args)
    {
        PMap test = new PMap();
        test.put(3, 5);
        test.put(4, 6);
        test.put(5, 7);
        System.out.println(test.getList().size());
        System.out.println(test.remove(5));
        //System.out.println(test.getList());
        System.out.println(test.isEmpty());
        System.out.println(test.keySet());
        System.out.println(test.values());
        System.out.println(test.entrySet());
    }
}