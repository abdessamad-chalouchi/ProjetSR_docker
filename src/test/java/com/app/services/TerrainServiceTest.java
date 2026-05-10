//package com.app.services;
//
//import com.app.entities.Terrain;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class TerrainServiceTest {
//    @Autowired
//    private TerrainServices terrainServices;
//    @Test
//    public void testAddTerrain() {
//        Terrain terrain = new Terrain();
//        terrain.setCode("testCode");
//        terrain.setSurface("testSurface");
//        Terrain testedTerrain =  terrainServices.save(terrain);
//        Assertions.assertEquals("testCode", testedTerrain.getCode());
//        Assertions.assertEquals("testSurface", testedTerrain.getSurface());
////        terrainServices.delete(testedTerrain.getId());
////        Assertions.assertThrows(
////                IllegalStateException.class, () -> terrainServices.save(testedTerrain)
////        );
////        terrainServices.delete(testedTerrain.getId());
//    }
//    @Test
//    public void testAddInvalidTerrain() {
//        Terrain terrain = new Terrain();
//        terrain.setCode("testCode");
//        terrain.setSurface("testSurface");
////        Terrain testedTerrain =  terrainServices.save(terrain);
////        Assertions.assertEquals("testCode", testedTerrain.getCode());
////        Assertions.assertEquals("testSurface", testedTerrain.getSurface());
////        terrainServices.delete(testedTerrain.getId());
//        Assertions.assertThrows(
//                IllegalStateException.class, () -> terrainServices.save(terrain)
//        );
//    }
//}