package com.company;

import java.util.ArrayList;

public class Case {

    int size;

    public void resize(int size) { this.size = size; }
    public int GetSize() { return size;}


    public void Solution(ArrayList<Item> items)
    {
        for(int i = 0; i < items.size();i++)
            for(int j = i+1 ; j < items.size(); j++ )
                if(items.get(i).cost < items.get(j).cost)
                {
                    Item item = items.get(i);
                    items.set(i,items.get(j));
                    items.set(j,item);
                }

        int BestCost = 0;
        ArrayList<Item> BestItems = new ArrayList<>();
        for(int i = 0; i  < items.size();i++)
        {
            int cost = 0, size = this.GetSize();
            ArrayList<Item> list1 = new ArrayList<>();

            for(int j = i; j < items.size();j++)
                if(size>=items.get(j).GetSize())
                {
                    size-=items.get(j).GetSize();
                    cost+=items.get(j).GetCost();
                    list1.add(items.get(j));
                }

                if(cost>BestCost)
                {
                    BestCost = cost;
                    BestItems = list1;
                }

        }
        this.ShowInfo(BestItems);

    }


    public void ShowInfo(ArrayList<Item> items)
    {
        for(int i = 0; i < items.size();i++)
            System.out.println(items.get(i).GetCost() + " "+ items.get(i).GetSize());
    }

    public Case()
    {

    }
}
