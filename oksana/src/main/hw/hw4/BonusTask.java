package hw4;

import static java.lang.Integer.max;

/**
 * Created by Оксана on 11.10.2015.
 */
public class BonusTask {
    public static void main(String[] args) {

        {
            int ans=0;
            for (int i=100; i<=999;++i)
            {
                for (int j=100; j<=999;++j)
                {

                    int[] mas=new int[10];
                    int x=i*j;
                    int k=0;
                    while (x>0)
                    {
                        mas[k]=x%10;
                        x/=10;
                        ++k;
                    }
                    k=k-1;
                    int q=0;
                    for (int w=0; w<=k/2;++w)
                        if (mas[w]!=mas[k-w]) q=-1;
                    if (q!=-1) ans=max(i*j,ans);

                }
            }
            System.out.println(""+ans);
        }
    }
}
