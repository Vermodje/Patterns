package abstract_factory;

abstract class AbstractComponentsFactory {
    abstract Service getService(String name);
    abstract DAO getDAO(String name);
}
