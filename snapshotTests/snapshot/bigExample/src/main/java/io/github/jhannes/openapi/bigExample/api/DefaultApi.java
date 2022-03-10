/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.bigExample.api;

import io.github.jhannes.openapi.bigExample.model.*;

import java.time.LocalDate;
import io.github.jhannes.openapi.bigExample.model.PetDto;
import java.util.UUID;

import org.actioncontroller.actions.*;
import org.actioncontroller.values.*;
import org.actioncontroller.values.json.JsonBody;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface DefaultApi {
        /**
         * 
         * 
         * @param storeId  (required)
         * @param petDto  (optional)
         */
        @POST("/{storeId}/pets")
        public void addPet(
                @PathParam("storeId") UUID storeId, 
                @JsonBody PetDto petDto
        ) throws IOException;
        /**
         * 
         * 
         * @param petId  (required)
         * @param name Updated name of the pet (optional)
         * @param status Updated status of the pet (optional)
         */
        @POST("/pets/{petId}")
        public void addPetWithForm(
                @PathParam("petId") UUID petId, 
                @RequestParam("name") Optional<String> name, 
                @RequestParam("status") Optional<String> status
        ) throws IOException;
        /**
         * 
         * 
         * @param storeId  (required)
         * @param status  (optional
         * @param tags  (optional
         * @param bornAfter  (optional)
         * @return PetDto
         */
        @GET("/{storeId}/pets")
        @JsonBody
        public PetDto listPets(
                @PathParam("storeId") UUID storeId, 
                @RequestParam("status") Optional<List<String>> status, 
                @RequestParam("tags") Optional<List<String>> tags, 
                @RequestParam("bornAfter") Optional<LocalDate> bornAfter
        ) throws IOException;
}
