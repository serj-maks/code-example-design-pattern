package edu.serjmaks.patterns.proxy.ex01.before;

/*
  Не изменяя данный класс необходимо реализовать возможность аудирования операций данного сервиса.
  При получении аккаунта по id необходимо произвести логирование (аудирование) этого действия в формате:
  "В {текущее время} просмотрен аккаунт с id = {id}"
*/
public class AccountServiceImpl implements AccountService {

    @Override
    public Account getById(long id) {
        return new Account(id, "123456/7890/12/1/1");
    }
}
