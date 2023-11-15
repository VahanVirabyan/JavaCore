package homework1.employeemanagement.storage;

import homework1.employeemanagement.model.Company;
import homework1.employeemanagement.util.StorageSerializeUtil;

import java.io.Serializable;

public class CompanyStorage implements Serializable {

    private Company[] compamies = new Company[10];
    private int size;

    public void add(Company compamy) {
        if (size == compamies.length) {
            extend();
        }
        compamies[size++] = compamy;
        StorageSerializeUtil.serializeCompanyStorage(this);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(compamies[i]);
        }
    }

    private void extend() {
        Company[] tmp = new Company[compamies.length + 10];
        System.arraycopy(compamies, 0, tmp, 0, compamies.length);
        compamies = tmp;
    }


    public Company getById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (compamies[i].getId().equals(companyId)) {
                return compamies[i];
            }
        }
        return null;
    }

    public void deleteById(String companyId) {
        int indexById = getIndexById(companyId);
        if (indexById == -1) {
            System.out.println("Company does not exists!");
            return;
        }
        for (int i = 0; i < size; i++) {
            compamies[i - 1] = compamies[i];
        }
        size--;
        StorageSerializeUtil.serializeCompanyStorage(this);
    }

    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (compamies[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}
