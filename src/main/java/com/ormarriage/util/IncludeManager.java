package com.ormarriage.util;

import java.lang.reflect.Field;
import java.util.List;

public class IncludeManager<T> {
   /* private final IncludeTree<T> _includes = new IncludeTree<T>();


    public IncludeManager()
    {
        this(null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public IncludeManager(IEnumerable<string> rawIncludes = null)
    public IncludeManager(Iterable<String> rawIncludes)
    {
        BuildIncludes(rawIncludes);
    }
    public final boolean AddRawInclude(String rawInclude)
    {
        return _includes.AddPath(rawInclude);
    }
    public final Class GetLevelType(Iterable<Field> levels)
    {
        IncludeNodeImpl include = _includes.Find(levels);
        if (include == null || include.getConcreteType() == null)
        {
            return null;
        }
        else
        {
            return include.getConcreteType();
        }
    }

    public final boolean IsIncluded(Iterable<Field> levels)
    {
        return IsIncluded(levels, null);
    }

    //C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public bool IsIncluded(IEnumerable<Field> levels, Field current = null)
    public final boolean IsIncluded(Iterable<Field> levels, Field current)
    {
        if (levels == null)
        {
            return false;
        }

        if (current == null)
        {
            return _includes.Find(levels) != null;
        }

        java.util.ArrayList<Object> list = levels.ToList();
        list.add(current);
        return _includes.Find(list) != null;
    }
    private void BuildIncludes(Iterable<String> rawIncludes)
    {
        if (rawIncludes == null)
        {
            return;
        }
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
        for (var include : rawIncludes)
        {
            if (!_includes.AddPath(include))
            {
                throw new PasException(Error.ProgrammingError.WithArgs("error occurred when build include for:" + include));
            }
        }
    }
}
class IncludeTree<T> implements IncludeNode
{

    private List<IncludeNode> privateNodes;
    public final List<IncludeNode> getNodes()
    {
        return privateNodes;
    }
    public final void setNodes(List<IncludeNode> value)
    {
        privateNodes = value;
    }
    public final IncludeNodeImpl Find(Iterable<Field> paths)
    {
        List<IncludeNode> nodes = getNodes();
        IncludeNodeImpl node = null;
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
        for (Field path : paths)
        {
            if (nodes == null)
            {
                return null;
            }
            Object tempVar = nodes.FirstOrDefault(n => ((IncludeNodeImpl)n).getField() == path);
            node = (IncludeNodeImpl)((tempVar instanceof IncludeNodeImpl) ? tempVar : null);
            if (node == null)
            {
                return null;
            }
            nodes = node.getNodes();
        }
        return node;
    }

    public final boolean AddPath(String path)
    {
        Class type = T.class;
        IncludeNode node = this;
        java.util.ArrayList<Field> level = new java.util.ArrayList<Field>();
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
        for (var splitted : path.split("[.]", -1))
        {
            String step = splitted.trim();
            Class t;
            Field p;
            if (step.contains(","))
            {
                String typeString = step.substring(step.indexOf(',') + 1, step.indexOf(',') + 1 + step.length() - step.indexOf(',') - 1).trim();
                t = EntityExt.GetTypeOfName(typeString);
                step = step.substring(0, step.indexOf(',')).trim();
                p = type.GetProperty(step);
                if (p == null)
                {
                    return false;
                                   }
                if (t == null)
                {
                    return false;
                    //throw new RuntimeException(String.format("no such type %1$s at %2$s", typeString, path));
                }
            }
            else
            {
                p = type.GetProperty(step);
                if (p == null)
                {
                    //throw new Exception(string.Format("unknown object path {0} at {1}", path, step));
                    return false;
                }
                t = p.PropertyType;
            }

            IncludeNodeImpl tempVar2 = new IncludeNodeImpl();
            tempVar2.setField(p);
            tempVar2.setConcreteType(t);
            node = node.SafeAdd(n => n.Nodes, tempVar2);
            level.add(p);

            if (Utils.IsIList(t))
            {
                type = t.GetGenericArguments()[0];
            }
            else
            {
                type = Find(level).getConcreteType();
            }
        }
        return true;
    }
}

interface IncludeNode
{
    List<IncludeNode> getNodes();
    void setNodes(List<IncludeNode> value);
}

class IncludeNodeImpl implements IncludeNode
{
    private List<IncludeNode> privateNodes;
    public final List<IncludeNode> getNodes()
    {
        return privateNodes;
    }
    public final void setNodes(List<IncludeNode> value)
    {
        privateNodes = value;
    }
    private Class privateConcreteType;
    public final Class getConcreteType()
    {
        return privateConcreteType;
    }
    public final void setConcreteType(Class value)
    {
        privateConcreteType = value;
    }
    private Field privateField;
    public final Field getField()
    {
        return privateField;
    }
    public final void setField(Field value)
    {
        privateField = value;
    }

    public final boolean equals(IncludeNodeImpl other)
    {
        if (null == other)
        {
            return false;
        }
        if (this == other)
        {
            return true;
        }
        return equals(other.getField(), getField()); // && Equals(other.ConcreteType, ConcreteType);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (null == obj)
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        if (obj.getClass() != IncludeNodeImpl.class)
        {
            return false;
        }
        return equals((IncludeNodeImpl)obj);
    }

    @Override
    public int hashCode()
    {
        return (getField() != null ? getField().hashCode() : 0);
        //int code1 = (Field != null ? Field.GetHashCode() : 0);
        //int code2 = (ConcreteType != null ? ConcreteType.GetHashCode() : 0);
        //return code1 * 11 + code2;
    }
    */
}