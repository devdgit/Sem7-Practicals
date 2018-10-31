#include <omp.h>
#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main()
{
        int i, n, tmp, *x, changes,tid;
        int chunk;
        scanf("%d ", &n);
        chunk = n / 4;
        x = (int*) malloc(n * sizeof(int));
        for(i = 0; i < n; ++i)
            scanf("%d ", &x[i]);
    changes = 1;
    int nr = 0;
    while(changes)
    {
    #pragma omp parallel private(tmp)
    {
            nr++;
            changes = 0;
            #pragma omp for \
                    reduction(+:changes)		      
            for(i = 0; i < n - 1; i = i + 2)
            {tid = omp_get_thread_num(); 
		      printf("\nthread no =",tid);
                    if(x[i] > x[i+1] )
                    {
                            tmp = x[i];
                            x[i] = x[i+1];
                            x[i+1] = tmp;
                            ++changes;
                    }
            }
            #pragma omp for \
                    reduction(+:changes)                      
            for(i = 1; i < n - 1; i = i + 2)
            {tid = omp_get_thread_num(); 
		       printf("\nthread no =",tid);
                    if( x[i] > x[i+1] )
                    {
                            tmp = x[i];
                            x[i] = x[i+1];
                            x[i+1] = tmp;
                            ++changes;
                    }
            }
    }
    }
for(i = 0; i <= n; ++i)
            printf("\n%d ", x[i]);

    return 0;
}
