/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4loboe83
 */
public class FarmFacadeImpl implements FarmFacade {

    List<Animal> animals = new ArrayList<Animal>();

    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> animals2 = new ArrayList<Animal>(animals);
        return animals2;
    }

    @Override
    public void addDog(String name) {
       Animal dog=AnimalObjectFactory.createDog();
       dog.setName(name);
       animals.add(dog);
    }

    @Override
    public void addCat(String name) {
       Animal cat=AnimalObjectFactory.createCat();
       cat.setName(name);
       animals.add(cat);
    }

    @Override
    public void addCow(String name) {
       Animal cow=AnimalObjectFactory.createCow();
       cow.setName(name);
       animals.add(cow);
    }

}
