const base = {
    get() {
        return {
            url : "http://localhost:8080/kewaixuexishenghuopingtai/",
            name: "kewaixuexishenghuopingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/kewaixuexishenghuopingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "初小教育课外学习生活活动平台"
        } 
    }
}
export default base
