package com.bodleian.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoAllPropertiesEquals(Video expected, Video actual) {
        assertVideoAutoGeneratedPropertiesEquals(expected, actual);
        assertVideoAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoAllUpdatablePropertiesEquals(Video expected, Video actual) {
        assertVideoUpdatableFieldsEquals(expected, actual);
        assertVideoUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoAutoGeneratedPropertiesEquals(Video expected, Video actual) {
        assertThat(expected)
            .as("Verify Video auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoUpdatableFieldsEquals(Video expected, Video actual) {
        assertThat(expected)
            .as("Verify Video relevant properties")
            .satisfies(e -> assertThat(e.getTitle()).as("check title").isEqualTo(actual.getTitle()))
            .satisfies(e -> assertThat(e.getDescription()).as("check description").isEqualTo(actual.getDescription()))
            .satisfies(e -> assertThat(e.getUrl()).as("check url").isEqualTo(actual.getUrl()))
            .satisfies(e -> assertThat(e.getUrlContentType()).as("check url contenty type").isEqualTo(actual.getUrlContentType()))
            .satisfies(e -> assertThat(e.getUploadDate()).as("check uploadDate").isEqualTo(actual.getUploadDate()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoUpdatableRelationshipsEquals(Video expected, Video actual) {
        assertThat(expected)
            .as("Verify Video relationships")
            .satisfies(e -> assertThat(e.getMetaData()).as("check metaData").isEqualTo(actual.getMetaData()));
    }
}