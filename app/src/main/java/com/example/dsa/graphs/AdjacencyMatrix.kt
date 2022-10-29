package com.example.dsa.graphs



fun main(){
        var graphList = ArrayList<GraphNode>()
    graphList.add(GraphNode("A",0))
    graphList.add(GraphNode("B",1))
    graphList.add(GraphNode("C",2))
    graphList.add(GraphNode("D",3))
    graphList.add(GraphNode("E",4))

    val graph = Graph(graphList)
    graph.anUndirectedEdge(0,1)
    graph.anUndirectedEdge(0,2)
    graph.anUndirectedEdge(0,3)
    graph.anUndirectedEdge(1,4)
    graph.anUndirectedEdge(1,0)
    graph.anUndirectedEdge(2,0)
    graph.anUndirectedEdge(2,3)
    graph.anUndirectedEdge(3,4)
    graph.anUndirectedEdge(3,2)
    graph.anUndirectedEdge(3,0)
    graph.anUndirectedEdge(4,1)
    graph.anUndirectedEdge(4,3)
    println(graph.displayMatrix())

}

class GraphNode{
    var name : String
    var index : Int

    constructor(name : String,index : Int){
        this.name = name
        this.index = index
    }
}

class Graph{

    var graphList : ArrayList<GraphNode>
     var adjacencyMatrix : Array<Array<Int>>
    constructor(list : ArrayList<GraphNode>){
        this.graphList = list
        adjacencyMatrix = Array(list.size){Array(list.size){0}}
    }

    fun anUndirectedEdge(i: Int,j:Int){
        adjacencyMatrix[i][j] = 1
        adjacencyMatrix[j][i] = 1
    }

    fun displayMatrix() : String{
        var str = StringBuilder()
        str.append("  ")
        for (i in graphList){
            str.append("${i.name} ")
        }
        str.append("\n")
        for (i in graphList.withIndex()){
            str.append("${i.value.name}:")
            for (j in adjacencyMatrix[i.index]){
                str.append("$j ")
            }
            str.append("\n")
        }
        return str.toString()
    }
}