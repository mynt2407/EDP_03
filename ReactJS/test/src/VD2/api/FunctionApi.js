import axiosClient from "./axiosCreate";

const url = "/todos";

const getAll = () => {
    return axiosClient.get(url);
}
const getById = (id) => {
    return axiosClient.get(`${url}/${id}`);
}
const create = (body) => {
    return axiosClient.post(url, body);
}
const updateById = (id, body) => {
    return axiosClient.put(`${url}/${id}`, body);
}
const deleteById = (id) => {
    return axiosClient.delete(`${url}/${id}`);
}
const EmployessApi = { getAll, getById, create, updateById, deleteById }
export default EmployessApi;