package ru.easyshop.database.repository.landing;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import ru.easyshop.controller.landing.LandingRequest;
import ru.easyshop.controller.landing.dto.LandingDto;
import ru.easyshop.database.entity.landing.Landing;

import java.util.List;
import java.util.Optional;

public class LandingRepositoryImpl implements LandingRepository {

    @Override
    public LandingDto findLandingData(LandingRequest landingRequest) {
        return LandingDto.builder().build();
    }

    @Override
    public List<Landing> findAll() {
        return null;
    }

    @Override
    public List<Landing> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Landing> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Landing> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Landing landing) {

    }

    @Override
    public void deleteAll(Iterable<? extends Landing> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Landing> S save(S s) {
        return null;
    }

    @Override
    public <S extends Landing> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Landing> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Landing> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Landing> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Landing getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Landing> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Landing> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Landing> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Landing> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Landing> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Landing> boolean exists(Example<S> example) {
        return false;
    }
}
