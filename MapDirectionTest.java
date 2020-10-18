package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapDirectionTest {
    @Test
    public void NextTest(){
        Assert.assertEquals(World.MapDirection.EAST, World.MapDirection.NORTH.next());
        Assert.assertEquals(World.MapDirection.SOUTH, World.MapDirection.EAST.next());
        Assert.assertEquals(World.MapDirection.WEST, World.MapDirection.SOUTH.next());
        Assert.assertEquals(World.MapDirection.NORTH, World.MapDirection.WEST.next());
    }
    @Test
    public void PreviousTest(){
        Assert.assertEquals(World.MapDirection.WEST, World.MapDirection.NORTH.previous());
        Assert.assertEquals(World.MapDirection.NORTH, World.MapDirection.EAST.previous());
        Assert.assertEquals(World.MapDirection.EAST, World.MapDirection.SOUTH.previous());
        Assert.assertEquals(World.MapDirection.SOUTH, World.MapDirection.WEST.previous());
    }

}