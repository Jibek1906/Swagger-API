package com.api.swagger.controller

import com.api.swagger.model.Dto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/examples")
@Api(description = "Swagger")
class ExampleCntroller {

    @GetMapping
    @ApiOperation("Get all writings list")
    fun getAll(): List<Dto> {
        return emptyList()
    }

    @PostMapping
    @ApiOperation("Creating new writings")
    fun create(@RequestBody dto: Dto) {

    }

    @PutMapping("/{id}")
    @ApiOperation("Reload existing writings")
    fun update(
        @PathVariable id: Int,
        @RequestBody dto: Dto,
    ){

    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deleting writings")
    fun deletedbyId(@PathVariable id: Int){

    }
}