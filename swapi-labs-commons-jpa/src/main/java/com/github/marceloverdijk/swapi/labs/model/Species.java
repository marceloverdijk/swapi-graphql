/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.marceloverdijk.swapi.labs.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

/**
 * Represents a species.
 *
 * @author Marcel Overdijk
 */
@Entity
@Table(name = "species")
public class Species extends BaseModel<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "classification")
    private String classification;

    @Column(name = "designation")
    private String designation;

    @Column(name = "average_height")
    private Integer averageHeight;

    @Column(name = "skin_colors")
    private String skin_colors;

    @Column(name = "hair_colors")
    private String hair_colors;

    @Column(name = "eye_colors")
    private String eye_colors;

    @Column(name = "average_lifespan")
    private Integer averageLifespan;

    @ManyToOne
    @JoinColumn(name = "homeworld")
    private Planet homeworld;

    @Column(name = "language")
    private String language;

    // TODO
    private List<Person> persons;

    // TODO
    private List<Film> films;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(final String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(final String designation) {
        this.designation = designation;
    }

    public Integer getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(final Integer averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(final String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(final String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(final String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public Integer getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(final Integer averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public Planet getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(final Planet homeworld) {
        this.homeworld = homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(final List<Person> persons) {
        this.persons = persons;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(final List<Film> films) {
        this.films = films;
    }

    @Override
    public boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}